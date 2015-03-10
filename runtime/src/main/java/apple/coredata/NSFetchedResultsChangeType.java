package apple.coredata;


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



/**
 * @since Available in iOS 3.0 and later.
 */


@Mapping("NSFetchedResultsChangeType")
public final class NSFetchedResultsChangeType extends ObjCEnum {
    
    @GlobalConstant("NSFetchedResultsChangeInsert")
    public static final long Insert = 1L;
    @GlobalConstant("NSFetchedResultsChangeDelete")
    public static final long Delete = 2L;
    @GlobalConstant("NSFetchedResultsChangeMove")
    public static final long Move = 3L;
    @GlobalConstant("NSFetchedResultsChangeUpdate")
    public static final long Update = 4L;
    

}
