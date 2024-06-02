public static void main(String[] args) {

   Market market = new Market();

    market.EnteredTheQueue("Олег");
    market.it_ordered("Заказ №1");
    market.update();
    market.ExitTheQueue();
    market.in_order();

    market.update();
    market.EnteredTheQueue("Иван");
    market.it_ordered("Заказ №2");
    market.update();
    market.ExitTheQueue();
    market.in_order();


    market.update();
    market.EnteredTheQueue("Катя");
    market.it_ordered("Заказ №3");
    market.update();
    market.ExitTheQueue();
    market.in_order();
    

}

