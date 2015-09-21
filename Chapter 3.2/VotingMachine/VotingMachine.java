// Implement a data type VotingMachine for tabulating votes.
// Include mutator methods voteRepublican(), voteDemocrat(), and voteIndependent().
// Include an accessor method getCount() to retrieve the total number of votes.

public class VotingMachine
{
    private int dem, rep, ind;
    private String name;
    public VotingMachine(int d0, int r0, int i0, String n0)
    { dem = d0; rep = r0; ind = i0; name = n0;}
    
    public void voteRepublican()
    { rep++; }
    
    public void voteDemocrat()
    { dem++; }
    
    public void voteIndependent()
    { ind++; }
    
    public int getCount()
    { return rep + dem + ind; }
    
    public String toString()
    { return name + ": (" + dem + " dem, " + rep + " rep, " + ind + " ind)"; }
    
    public static void main(String[] args)
    {
        VotingMachine tiltDem = new VotingMachine(0, 0, 0, "tiltDem");
        for (int i = 0; i < 1000000; i++)
        {
            double rand = Math.random();
            if (rand < 0.33) tiltDem.voteRepublican();
            if (rand >= 0.33 && rand < .6) tiltDem.voteIndependent();
            if (rand >= .6) tiltDem.voteDemocrat();
        }
        System.out.println(tiltDem.getCount());
        System.out.println(tiltDem);
    }
}