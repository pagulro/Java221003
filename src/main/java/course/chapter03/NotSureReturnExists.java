package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-10-03
 */

class NotSureReturnExists {

    String badReturn() {
        if (5 > 4) {
            return "bad job";
        }

        return "";
        // missing return, not compile
    }
}
