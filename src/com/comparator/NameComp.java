package com.comparator;

import java.util.*;
class NameComp implements Comparator<Person>{
        public int compare(Person p1,Person p2)
        {
            return p2.name.compareTo(p1.name);
        }
}
