class TelephoneNumber {
    private String _number;
    private String _areaCode;

    public String getTelephoneNumber() {
        return ("(" + _areaCode + ")" + _number);
    }

    String getAreaCode() {
        return _areaCode;
    }

    void setAreaCode(String arg) {
        _areaCode = arg;
    }

    String getNumber() {
        return _number;
    }

    void setNumber(String arg) {
        _number = arg;
    }
}
