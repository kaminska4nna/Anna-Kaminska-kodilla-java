package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    public static List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser("tom", 1, 12, 'M', 1988, 9, 12));
        theList.add(new ForumUser("alice", 2, 1, 'F', 1987, 10, 1));
        theList.add(new ForumUser("grace", 3, 133, 'F', 1987, 11, 3));
        theList.add(new ForumUser("tomas", 4, 122, 'M', 2000, 2, 12));
        theList.add(new ForumUser("mike", 5, 122, 'M', 1994, 2, 1));
        theList.add(new ForumUser("joey", 6, 0, 'M', 1986, 6, 2));

        return new ArrayList<ForumUser>(theList);
    }


}
