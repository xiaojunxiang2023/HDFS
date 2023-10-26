package org.apache.hadoop.fs.shell;

/**
 * The {code PrintableString} class converts any string to a printable string
 * by replacing non-printable characters with ?.
 *
 * Categories of Unicode non-printable characters:
 * <ul>
 * <li> Control characters   (Cc)
 * <li> Formatting Unicode   (Cf)
 * <li> Private use Unicode  (Co)
 * <li> Unassigned Unicode   (Cn)
 * <li> Standalone surrogate (Unfortunately no matching Unicode category)
 * </ul>
 *
 * @see Character
 * @see <a href="http://www.unicode.org/">The Unicode Consortium</a>
 */
class PrintableString {
  private static final char REPLACEMENT_CHAR = '?';

  private final String printableString;

  PrintableString(String rawString) {
    StringBuilder stringBuilder = new StringBuilder(rawString.length());
    for (int offset = 0; offset < rawString.length();) {
      int codePoint = rawString.codePointAt(offset);
      offset += Character.charCount(codePoint);

      switch (Character.getType(codePoint)) {
      case Character.CONTROL:     // Cc
      case Character.FORMAT:      // Cf
      case Character.PRIVATE_USE: // Co
      case Character.SURROGATE:   // Cs
      case Character.UNASSIGNED:  // Cn
        stringBuilder.append(REPLACEMENT_CHAR);
        break;
      default:
        stringBuilder.append(Character.toChars(codePoint));
        break;
      }
    }
    printableString = stringBuilder.toString();
  }

  public String toString() {
    return printableString;
  }
}
