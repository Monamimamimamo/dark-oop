package ru.urfu;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {
        String telegramBotName = System.getenv("telegram_botName");
        String telegramToken = System.getenv("telegram_token");
        BotService botService = new BotService();
        new TelegramBot(telegramBotName, telegramToken, botService)
                .start();

        String discordToken = System.getenv("discord_token");
        new DiscordBot(discordToken, botService)
                .start();

        // сколько угодно чат платформ и все должны работать одинаково
    }

}
