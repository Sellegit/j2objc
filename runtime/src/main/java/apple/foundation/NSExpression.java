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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("Foundation") @Mapping("NSExpression")
public class NSExpression 
    extends NSObject 
    implements NSCopying {

    
    
    public NSExpression() {}
    @Mapping("initWithExpressionType:")
    public NSExpression(@Representing("NSExpressionType") @MachineSizedUInt long type) { }
    
    
    @Mapping("expressionType")
    public native @Representing("NSExpressionType") @MachineSizedUInt long getExpressionType();
    @Mapping("constantValue")
    public native Object getConstantValue();
    @Mapping("keyPath")
    public native String getKeyPath();
    @Mapping("function")
    public native String getFunction();
    @Mapping("variable")
    public native String getVariable();
    @Mapping("operand")
    public native NSExpression getOperand();
    @Mapping("arguments")
    public native NSArray<?> getArguments();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("collection")
    public native Object getCollection();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("leftExpression")
    public native NSExpression getLeftExpression();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("rightExpression")
    public native NSExpression getRightExpression();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("expressionBlock")
    public native @Block Block3<NSObject, NSArray<NSExpression>, NSMutableDictionary<?, ?>, NSObject> getExpressionBlock();
    
    
    
    @Mapping("expressionValueWithObject:context:")
    public native Object evaluate(Object object, NSMutableDictionary<?, ?> context);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("allowEvaluation")
    public native void allowEvaluation();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("expressionWithFormat:argumentArray:")
    public static native NSExpression createFromFormat(String expressionFormat, NSArray<?> arguments);
    @Mapping("expressionForConstantValue:")
    public static native NSExpression createForConstantValue(Object obj);
    @Mapping("expressionForEvaluatedObject")
    public static native NSExpression createForEvaluatedObject();
    @Mapping("expressionForVariable:")
    public static native NSExpression createForVariable(String string);
    @Mapping("expressionForKeyPath:")
    public static native NSExpression createForKeyPath(String keyPath);
    @Mapping("expressionForFunction:arguments:")
    public static native NSExpression createForFunction(String name, NSArray<?> parameters);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("expressionForAggregate:")
    public static native NSExpression createForAggregate(NSArray<?> subexpressions);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("expressionForUnionSet:with:")
    public static native NSExpression createForUnionSet(NSExpression left, NSExpression right);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("expressionForIntersectSet:with:")
    public static native NSExpression createForIntersectSet(NSExpression left, NSExpression right);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("expressionForMinusSet:with:")
    public static native NSExpression createForMinusSet(NSExpression left, NSExpression right);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("expressionForSubquery:usingIteratorVariable:predicate:")
    public static native NSExpression createForSubquery(NSExpression expression, String variable, Object predicate);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("expressionForFunction:selectorName:arguments:")
    public static native NSExpression createForFunction(NSExpression target, String name, NSArray<?> parameters);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("expressionForAnyKey")
    public static native NSExpression createForAnyKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("expressionForBlock:arguments:")
    public static native NSExpression createForBlock(@Block Block3<NSObject, NSArray<NSExpression>, NSMutableDictionary<?, ?>, NSObject> block, NSArray<?> arguments);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
