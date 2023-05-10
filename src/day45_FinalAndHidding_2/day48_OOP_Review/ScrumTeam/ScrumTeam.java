package day45_FinalAndHidding_2.day48_OOP_Review.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner PO;

    public BusinessAnalyst BA;

    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();

    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    public void addTester(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
