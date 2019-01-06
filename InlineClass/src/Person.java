class Person {
    private String _name;
    private String _areaCode;
    private String _number;

    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public Person(String name, String areaCode, String number) {
        _name = name;
        _areaCode = areaCode;
        _number = number;

        fillTelephone();
    }

    private void fillTelephone() {
        if (_officeTelephone != null) {
            _officeTelephone.setAreaCode(_areaCode);
            _officeTelephone.setNumber(_number);
        }
    }

    public String getName() {
        return _name;
    }

    private TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

    public String getAreaCode() {
        return _officeTelephone.getAreaCode();
    }

    public String getInfo() {
        return _name + ": " + getTelephoneNumber();
    }
}
