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
    protected static native CFString CalendarIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayEraKey")
    protected static native CFString EraKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayYearKey")
    protected static native CFString YearKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayMonthKey")
    protected static native CFString MonthKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayIsLeapMonthKey")
    protected static native CFString IsLeapMonthKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayDayKey")
    protected static native CFString DayKey();
    
}
