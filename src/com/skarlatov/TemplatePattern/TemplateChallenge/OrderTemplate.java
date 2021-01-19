package com.skarlatov.TemplatePattern.TemplateChallenge;

abstract class OrderTemplate {
    public boolean isGift;

    public abstract void doSelect();
    public abstract void doPayment();

    public abstract void doDelivery();

    public final void giftWrap(){
        System.out.println("gift wrapping process successful");
    }


// this is the tempaltye method
    public final void templateMethod(boolean isGift) {
    }
    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();

        if (isGift){
            giftWrap();
        }
        doDelivery();
    }
}


class NetOrder extends OrderTemplate {
    @Override
    public void doSelect() {
        System.out.println("Item aded to onling shopping cart \n" +
                "get gift wrap preference\n" +
                "get delivery address.");

    }

    @Override
    public void doPayment() {
        System.out.println("Online payment thorugh netbanking, card or paypal");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through the post office to delivery address");
    }
}


class StoreOrder extends OrderTemplate {
    @Override
    public void doSelect() {
         System.out.println("Customer Chooses the item froim the shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through cash/pos");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to customer in delivery counter");
    }
}


