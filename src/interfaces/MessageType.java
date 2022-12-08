package interfaces;

public enum MessageType {

    TEXT("text", 0),
    SMILE("smile", 1),
    PICTURE("picture", 2);

    private int code;
    private String typeName;

    MessageType(String typeName, int code) {
        this.typeName = typeName;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "MessageType{" +
                "code=" + code +
                ", typeName='" + typeName + '\'' +
                "} " + super.toString();
    }
}
