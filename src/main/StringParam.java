package main;

public enum StringParam {
    LINE_SEPARATOR("\n--------------------\n"),
    SECRET_MSG_XD("\nGoodbye, my dear friend, come back soon ٩(｡•́‿•̀｡)۶\n"),
    NEXT_LINE("\n"),
    INLINE_ROW("");

    private final String param;
    StringParam(String param) {
        this.param = param;
    }

    public String getParam() {
        return this.param;
    }
}
