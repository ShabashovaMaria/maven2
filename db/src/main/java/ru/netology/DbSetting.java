package src.main.java.ru.netology;

import java.util.UUID;

public class DbSetting {

    private String name;
    private String password;

    public DbSetting(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static class MyEntity {

        private UUID id;
        private String name;

        public MyEntity(String name) {
            this.name = name;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return new StringBuilder().append("src.main.java.ru.netology.DbSetting.MyEntity{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();
        }
    }
}