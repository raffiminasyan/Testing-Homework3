public class ZooEntryTicket {
    int adultTicketPrice = 20;
    int childTicketPrice = 10;
    int elderTicketPrice = 15;

    public int totalBudget = 780;
    int age;
    String ticketType;


    public ZooEntryTicket(int age) {
        this.age = age;
    }



    public String buyChildTicket() {
        if (totalBudget >= childTicketPrice) {
            if (age < 1) {
                return "Child can not enter";
            } else if (age >= 1 && age <= 12) {
                totalBudget -= childTicketPrice;
                return ticketType = "Child ticket purchased!";
            } else {
                return "Age exceeds child range!";
            }
        }
        return "Insufficient funds";
    }


    public String buyAdultTicket() {
        if (totalBudget >= adultTicketPrice) {
            if (age < 18) {
                return "Only adults can purchase adult tickets!";
            } else {
                totalBudget -= adultTicketPrice;
                return ticketType = "Adult ticket purchased!";
            }
        }
        return "Insufficient funds";
    }


    public String buyTicketForElderPeople() {
        if (totalBudget >= elderTicketPrice) {
            if (age >= 65) {
                totalBudget -= elderTicketPrice;
                return ticketType = "Elder ticket purchased!";
            } else {
                return "Only elders can purchase this ticket";
            }
        }
        return "Insufficient funds";
    }

    public void refundTicket(int ticketPrice) {
        totalBudget += ticketPrice;
    }


    public boolean isBudgetZero() {
        return totalBudget == 0;
    }
}