package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;


/**
 * @since Available in iOS 4.0 and later.
 */
@Library("MapKit/MapKit.h")
@Mapping("MKAnnotationViewDragState")
public final class MKAnnotationViewDragState extends ObjCEnum {
    
    @GlobalConstant("MKAnnotationViewDragStateNone")
    public static final long None = 0L;
    @GlobalConstant("MKAnnotationViewDragStateStarting")
    public static final long Starting = 1L;
    @GlobalConstant("MKAnnotationViewDragStateDragging")
    public static final long Dragging = 2L;
    @GlobalConstant("MKAnnotationViewDragStateCanceling")
    public static final long Canceling = 3L;
    @GlobalConstant("MKAnnotationViewDragStateEnding")
    public static final long Ending = 4L;


}
