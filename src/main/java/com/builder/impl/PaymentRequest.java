package com.builder.impl;

public class PaymentRequest {

    private final String transactionId;
    private final String paymentMethod;
    private final double amount;
    private final String currency;
    private final String merchantId;
    private final boolean saveCard;

    public static Builder builder() {
        return new Builder();
    }
    private PaymentRequest(Builder builder){
      this.transactionId = builder.transactionId;
      this.paymentMethod = builder.paymentMethod;
      this.amount = builder.amount;
      this.currency = builder.currency;
      this.merchantId = builder.merchantId;
      this.saveCard = builder.saveCard;

    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "transactionId='" + transactionId + '\'' +
                ", PaymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", saveCard=" + saveCard +
                '}';
    }

    public static class Builder{
        private  String transactionId;
        private String paymentMethod;
        private  double amount;
        private  String currency;
        private  String merchantId;
        private  boolean saveCard;

        public Builder transactionId(String transactionId){
            this.transactionId = transactionId;
            return this;
        }

        public Builder paymentMethod(String paymentMethod){

            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder amount(double amount){
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency){
            this.currency = currency;
            return this;
        }

        public Builder merchantId(String merchantId){
            this.merchantId = merchantId;
            return this;
        }

        public Builder saveCard(boolean saveCard){
            this.saveCard = saveCard;
            return this;
        }

        public PaymentRequest build(){
            return new PaymentRequest(this);
        }
    }

}
