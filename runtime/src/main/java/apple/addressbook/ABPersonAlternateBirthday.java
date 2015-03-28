package apple.addressbook;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook/AddressBook.h")
public class ABPersonAlternateBirthday 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayCalendarIdentifierKey")
    public static native CFString CalendarIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayEraKey")
    public static native CFString EraKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayYearKey")
    public static native CFString YearKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayMonthKey")
    public static native CFString MonthKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayIsLeapMonthKey")
    public static native CFString IsLeapMonthKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayDayKey")
    public static native CFString DayKey();

}
