package t3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSync extends Thread {
    Set<Integer> syncHashSet;
    public SetSync(String name) {
        super(name);
        syncHashSet = Collections.synchronizedSet(new HashSet<>());
        syncHashSet.add(1);
        syncHashSet.add(2);
    }

    @Override
    public void run() {
        SetSync();
    }

    public void SetSync(){
        Iterator<Integer> itr = syncHashSet.iterator();
        synchronized (syncHashSet)
        {
            while(itr.hasNext()) {
                syncHashSet.add(1);
                syncHashSet.add(2);
                itr.next();
                System.out.println(Thread.currentThread().getName() + syncHashSet);
            }
        }
    }
}