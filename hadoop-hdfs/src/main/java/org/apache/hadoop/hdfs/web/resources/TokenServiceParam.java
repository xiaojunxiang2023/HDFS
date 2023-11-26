package org.apache.hadoop.hdfs.web.resources;

public class TokenServiceParam extends StringParam {

    /** Parameter name */
    public static final String NAME = "service";
    /** Default parameter value. */
    public static final String DEFAULT = NULL;

    private static final StringParam.Domain DOMAIN = new StringParam.Domain(NAME, null);

    /**
     * Constructor.
     * @param str a string representation of the parameter value.
     */
    public TokenServiceParam(final String str) {
        super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
