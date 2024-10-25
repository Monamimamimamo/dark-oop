package ru.urfu;

/**
 * Класс реализует основной интерфейс чат бота
 */
public interface ChatBot {

    /**
     * Отправляет сообщение пользователю
     */
    void sendMessage(String chatId, String message);

    // Можно добавлять новые функции для расширения функционала
}
