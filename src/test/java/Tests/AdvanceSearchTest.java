package Tests;

import BaseTest.BaseTest;
import Pages.AdvanceSearchPage;
import org.junit.Test;

public class AdvanceSearchTest extends BaseTest {

    @Test
    public void advanceSearchTest() {
        AdvanceSearchPage advanceSearch = new AdvanceSearchPage(Driver);
        advanceSearch.advanceSearchOnPage("HP Envy 6", "Computers >> Notebooks", "HP");
    }
}
