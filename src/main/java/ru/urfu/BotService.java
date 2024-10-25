package ru.urfu;

/**
 * Класс реализует сервисную часть ботов
 */
public class BotService {

    /**
     * Генерирует эхо для ответа пользователю
     */
    public String generateBotEcho(String messageFromUser) {
        return String.format("Ваше сообщение: '%s'", messageFromUser);
    }

    // Можно добавлять новые функции для расширения функционала
}
