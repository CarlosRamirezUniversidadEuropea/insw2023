package com.ue.insw.proyecto.exercises.ej7json;

public class Empleado {
        String name;
        String email;
        int phone;
        boolean subscribed;
        String birth;

        public Empleado(String name, String email, int phone, boolean subscribed, String birth) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.subscribed = subscribed;
            this.birth = birth;
        }

        public Empleado(){}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getBirth() {
        return birth;
    }

        public void setBirth(String birth) {
        this.birth = birth;
    }

        public boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }


        @Override
        public String toString() {
            return "Employee{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", phone=" + phone + ", subscribed=" + subscribed + ", birth='" + birth + '\'' + '}';
        }
}
