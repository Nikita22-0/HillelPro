package com.hillel.pashchenko.lesson3;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Support support = new Support();
        demo(user);
        demo(support);
        user.read(user.write());



    }
    public static void demo(User user){
        if(user instanceof Support){
            ((Support) user).check("Когда приходит бешеная ясность,");
        } else if (user instanceof Admin){
            ((Admin) user).delete(true);
        }
    }
}
