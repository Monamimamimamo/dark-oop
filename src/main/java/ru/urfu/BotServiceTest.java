package ru.urfu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для Bot
 */
public class BotServiceTest {

    /**
     * Тест проверяет, что Bot действительно возвращает эхо на сообщение пользователя
     */
    @Test
    public void testGenerateBotEcho() {
        Bot botService = new Bot();
        String messageFromUser = "Привет, Bot!";
        String expectedResponse = String.format("Ваше сообщение: '%s'", messageFromUser);

        // Проверяем, что метод возвращает корректное сообщение
        assertEquals(expectedResponse, botService.generateBotEcho(messageFromUser));
    }
}
