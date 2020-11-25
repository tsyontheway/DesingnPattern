package Iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department 是以怎样的方式存放=>数组
    Department[] mDepartments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        mDepartments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= mDepartments.length || mDepartments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = mDepartments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
