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






@Mapping("NSExpressionType")
public final class NSExpressionType extends ObjCEnum {
    
    @GlobalConstant("NSConstantValueExpressionType")
    public static final long ConstantValue = 0L;
    @GlobalConstant("NSEvaluatedObjectExpressionType")
    public static final long EvaluatedObject = 1L;
    @GlobalConstant("NSVariableExpressionType")
    public static final long Variable = 2L;
    @GlobalConstant("NSKeyPathExpressionType")
    public static final long KeyPath = 3L;
    @GlobalConstant("NSFunctionExpressionType")
    public static final long Function = 4L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUnionSetExpressionType")
    public static final long UnionSet = 5L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSIntersectSetExpressionType")
    public static final long IntersectSet = 6L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMinusSetExpressionType")
    public static final long MinusSet = 7L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSubqueryExpressionType")
    public static final long Subquery = 13L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSAggregateExpressionType")
    public static final long Aggregate = 14L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSAnyKeyExpressionType")
    public static final long AnyKey = 15L;
    @GlobalConstant("NSBlockExpressionType")
    public static final long Block = 19L;
    

}
