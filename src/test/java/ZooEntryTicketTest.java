import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ZooEntryTicketTest {
    @Test
    public void testBuyChildTicket() {
        ZooEntryTicket ticket1 = new ZooEntryTicket(0);
        ZooEntryTicket ticket2 = new ZooEntryTicket(4);
        ZooEntryTicket ticket3 = new ZooEntryTicket(15);

        assertEquals(ticket1.buyChildTicket(), "Child can not enter", "The age was wrong!");
        assertEquals(ticket2.buyChildTicket(), "Child ticket purchased!", "The age is okay!");
        assertEquals(ticket3.buyChildTicket(), "Age exceeds child range!", "The age was wrong!");
    }

    @Test
    public void elderlyTicketPurchaseTest() {
        ZooEntryTicket ElderPerson1 = new ZooEntryTicket(64);
        ZooEntryTicket ElderPerson2 = new ZooEntryTicket(70);

        assertEquals(ElderPerson1.buyTicketForElderPeople(), "Only elders can purchase this ticket", "The age was wrong!");
        assertEquals(ElderPerson2.buyTicketForElderPeople(), "Elder ticket purchased!", "The age is okay!");
    }

    @Test
    public void buyAdultTicketTest() {
        ZooEntryTicket ticket1 = new ZooEntryTicket(17);
        ZooEntryTicket ticket2 = new ZooEntryTicket(25);

        assertEquals(ticket1.buyAdultTicket(), "Only adults can purchase adult tickets!");
        assertEquals(ticket2.buyAdultTicket(), "Adult ticket purchased!");
    }

    @Test
    public void refundTicketTest() {
        ZooEntryTicket ticket = new ZooEntryTicket(10);
        ticket.refundTicket(15);
        assertEquals(ticket.totalBudget, 795);
    }

    @Test
    public void isBudgetZeroTest() {
        ZooEntryTicket ticket1 = new ZooEntryTicket(10);
        ZooEntryTicket ticket2 = new ZooEntryTicket(20);

        assertFalse(ticket1.isBudgetZero());
        assertTrue(!ticket2.isBudgetZero());
    }

    @Test
    public void checkingTotalBudget() {
        ZooEntryTicket ticket1 = new ZooEntryTicket(15);

        ticket1.totalBudget = 5;

        assertEquals(ticket1.buyChildTicket(), "Insufficient funds");
        assertEquals(ticket1.buyAdultTicket(), "Insufficient funds");
        assertEquals(ticket1.buyTicketForElderPeople(), "Insufficient funds");
    }

}