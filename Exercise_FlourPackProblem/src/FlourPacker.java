public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        bigCount *= 5;
        if (bigCount - smallCount == goal)
            return true;
        if ((bigCount+smallCount) > goal)
        {
            if (smallCount > 0)
            {
                if(bigCount-smallCount == goal)
                    return true;
                if (bigCount==0 || smallCount>4)
                    return true;
                if (bigCount > goal && bigCount%smallCount==0)
                    return true;
            }
            return false;
        }
        if (bigCount+smallCount == goal)
            return true;


        return false;
    }
}
