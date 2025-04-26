package design.patterns.Behavioural.Observer;

public class Client {
    public static void main(String[] args) {
        String news="Breaking news:Kashmir bombed";
        NewsAgency agency=new NewsAgency(){};

        agency.registerObserver(new EmailSubscriber());
        agency.registerObserver(new MobileSubscriber());
        agency.publishNews(news);

    }
}
