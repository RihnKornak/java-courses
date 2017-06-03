package ru.lesson.lessons;

 class Menu {
     void showAdminTopMenu(){
        System.out.println("Добро пожаловать в СУБД клиники для животных.");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Пользуясь меню ниже, вы можете оперировать данными: ");
        System.out.println("1. Добавить нового клиента");
        System.out.println("2. Редактировать записи имеющегося в базе клиента");
        System.out.println("3. Удалить из базы данных клиники записи клиента");
        System.out.println("4. Показать всех имеющихся клиентов");
        System.out.println("5. Показать всех имеющихся в базе питомцев");
        System.out.println("6. Найти клиента по имени");
        System.out.println("7. Найти питомца по кличке");
        System.out.println("8. Выйти из программы");
        System.out.println("Выберите необходимое действие вводом цифры меню:");
    }

     void showUserTopMenu(){
        System.out.println("Добро пожаловать в СУБД клиники для животных.");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Пользуясь меню ниже, вы можете оперировать данными: ");
        System.out.println("1. Показать всех имеющихся клиентов");
        System.out.println("2. Показать всех имеющихся в базе питомцев");
        System.out.println("3. Найти клиента по имени");
        System.out.println("4. Найти питомца по кличке");
        System.out.println("5. Выйти из программы");
        System.out.println("Выберите необходимое действие вводом цифры меню:");
    }

     void showClientEditMenu(String clientName){
        System.out.println("Вы находитесь в меню редактирования записей клиента " + clientName);
        System.out.println("_____________________________________________");
        System.out.println("Выберите необходимое действие из меню ниже :");
        System.out.println("1. Изменить имя клиента");
        System.out.println("2. Изменить имя питомца");
        System.out.println("3. Добавить питомца");
        System.out.println("4. Удалить питомца");
        System.out.println("5. Показать всех питомцев клиента");
        System.out.println("6. Выйти из этого меню");
        System.out.println("Сделайте выбор, несмелый вы наш");
    }

     void showStatusConsole(){
        System.out.println("Введите свой статус : ");
        System.out.println("Если вы администратор,наберите \"yes\"");
        System.out.println("[yes/no]");
    }

}
