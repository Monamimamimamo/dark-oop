package ru.urfu;

/**
 * Класс реализует функционал бота для чат-бот платформ
 */
public class Bot {

    /**
     * Генерирует эхо для ответа пользователю
     */
    public String generateBotEcho(String messageFromUser) {
        return String.format("Ваше сообщение: '%s'", messageFromUser);
    }

    // Можно добавлять новые функции для расширения функционала
}
