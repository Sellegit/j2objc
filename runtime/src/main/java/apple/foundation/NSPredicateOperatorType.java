package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;






@Mapping("NSPredicateOperatorType")
public final class NSPredicateOperatorType extends ObjCEnum {
    
    @GlobalConstant("NSLessThanPredicateOperatorType")
    public static final long LessThan = 0L;
    @GlobalConstant("NSLessThanOrEqualToPredicateOperatorType")
    public static final long LessThanOrEqualTo = 1L;
    @GlobalConstant("NSGreaterThanPredicateOperatorType")
    public static final long GreaterThan = 2L;
    @GlobalConstant("NSGreaterThanOrEqualToPredicateOperatorType")
    public static final long GreaterThanOrEqualTo = 3L;
    @GlobalConstant("NSEqualToPredicateOperatorType")
    public static final long EqualTo = 4L;
    @GlobalConstant("NSNotEqualToPredicateOperatorType")
    public static final long NotEqualTo = 5L;
    @GlobalConstant("NSMatchesPredicateOperatorType")
    public static final long Matches = 6L;
    @GlobalConstant("NSLikePredicateOperatorType")
    public static final long Like = 7L;
    @GlobalConstant("NSBeginsWithPredicateOperatorType")
    public static final long BeginsWith = 8L;
    @GlobalConstant("NSEndsWithPredicateOperatorType")
    public static final long EndsWith = 9L;
    @GlobalConstant("NSInPredicateOperatorType")
    public static final long In = 10L;
    @GlobalConstant("NSCustomSelectorPredicateOperatorType")
    public static final long CustomSelector = 11L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSContainsPredicateOperatorType")
    public static final long Contains = 99L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSBetweenPredicateOperatorType")
    public static final long Between = 100L;
    

}
