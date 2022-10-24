package com.hillel.pashchenko.lesson14;


public class InitializationData {
    public void giveAndFillCollections(Information information) {
        for (int i = 1; i < 30; i++) {
            information.getNickname().add(String.valueOf(i));
            information.getMail().add(String.valueOf(i).concat("@gmail.com"));
            information.getAccount().put(String.valueOf(i).concat("@gmail.com"), String.valueOf(i));
        }
        copy(information);
        check(information);
        equals(information);
    }

    private void copy(Information information) {
        for (int i = 0; i < 11; i++) {
            information.getNickname().add("copy");
            information.getMail().add("copy".concat("@gmail.com"));
            information.getAccount().put("copy".concat("@gmail.com"),"copy");
        }
    }

    private void check(Information information) {
        for (int i = 0; i < information.getNickname().size(); i++) {
            if (!(information.getNickname().size() == 30)) {
                if (information.getNickname().get(i).equals("copy")) {
                    information.getNickname().remove(i);
                    i--;
                }
            }
        }
    }
    private Information equals (Information information){
        if (information.getNickname().size() == information.getMail().size()
                && information.getAccount().size() == information.getNickname().size()) {
            return information;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
