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
@Library("Foundation/Foundation.h") @Mapping("NSCompoundPredicate")
public class NSCompoundPredicate 
    extends NSPredicate 
     {

    
    
    @Mapping("initWithType:subpredicates:")
    public NSCompoundPredicate(@Representing("NSCompoundPredicateType") long type, NSArray<?> subpredicates) { }
    @Mapping("init")
    public NSCompoundPredicate() { }

    
    @Mapping("compoundPredicateType")
    public native @Representing("NSCompoundPredicateType") long getCompoundPredicateType();
    @Mapping("subpredicates")
    public native NSArray<NSPredicate> getSubpredicates();

    
    
    @Mapping("andPredicateWithSubpredicates:")
    public static native NSCompoundPredicate createAndPredicate(NSArray<?> subpredicates);
    @Mapping("orPredicateWithSubpredicates:")
    public static native NSCompoundPredicate createOrPredicate(NSArray<?> subpredicates);
    @Mapping("notPredicateWithSubpredicate:")
    public static native NSCompoundPredicate createNotPredicate(NSPredicate predicate);

}
