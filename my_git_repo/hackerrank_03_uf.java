 if(shipping.equals("Regular")) {
      return 0;
    else if (shipping.equals("Express")) {
      return 1.75;
    } else {
      return 0.50;
    }
    }
    }
 	}

 if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }

 //this is unsolved