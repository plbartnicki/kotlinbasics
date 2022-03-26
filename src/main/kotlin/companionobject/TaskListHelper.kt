package companionobject

class TaskListHelper {
    companion object {
        //l=["abc", "xyz", "abc"] -> s={"abc", "xyz"} = {"xyz", "abc"}
        //jesli w l jest duplikat to l.size > s.size
        fun containsDuplicate(words: List<String>): Boolean {
            return words.toSet().size != words.size    //O(n) + O(1) + O(1) = O(n)
        }
    }
}