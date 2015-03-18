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

@Library("Foundation/Foundation.h") @Mapping("NSUndoManager")
public class NSUndoManager 
    extends NSObject 
     {

    
    public static final int CloseGroupingRunLoopOrdering = 350000;
    
    
    @Mapping("init")
    public NSUndoManager() { }
    
    
    @Mapping("groupingLevel")
    public native @MachineSizedSInt long getGroupingLevel();
    @Mapping("isUndoRegistrationEnabled")
    public native boolean isUndoRegistrationEnabled();
    @Mapping("groupsByEvent")
    public native boolean groupsByEvent();
    @Mapping("setGroupsByEvent:")
    public native void setGroupsByEvent(boolean v);
    @Mapping("levelsOfUndo")
    public native @MachineSizedUInt long getLevelsOfUndo();
    @Mapping("setLevelsOfUndo:")
    public native void setLevelsOfUndo(@MachineSizedUInt long v);
    @Mapping("runLoopModes")
    public native List<String> getRunLoopModes();
    @Mapping("setRunLoopModes:")
    public native void setRunLoopModes(List<String> v);
    @Mapping("canUndo")
    public native boolean canUndo();
    @Mapping("canRedo")
    public native boolean canRedo();
    @Mapping("isUndoing")
    public native boolean isUndoing();
    @Mapping("isRedoing")
    public native boolean isRedoing();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("undoActionIsDiscardable")
    public native boolean isUndoActionDiscardable();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("redoActionIsDiscardable")
    public native boolean isRedoActionDiscardable();
    @Mapping("undoActionName")
    public native String getUndoActionName();
    @Mapping("redoActionName")
    public native String getRedoActionName();
    @Mapping("undoMenuItemTitle")
    public native String getUndoMenuItemTitle();
    @Mapping("redoMenuItemTitle")
    public native String getRedoMenuItemTitle();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSUndoManagerGroupIsDiscardableKey")
    public static native NSString GroupIsDiscardableKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerCheckpointNotification")
    public static native NSString CheckpointNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerWillUndoChangeNotification")
    public static native NSString WillUndoChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerWillRedoChangeNotification")
    public static native NSString WillRedoChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerDidUndoChangeNotification")
    public static native NSString DidUndoChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerDidRedoChangeNotification")
    public static native NSString DidRedoChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerDidOpenUndoGroupNotification")
    public static native NSString DidOpenUndoGroupNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUndoManagerWillCloseUndoGroupNotification")
    public static native NSString WillCloseUndoGroupNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSUndoManagerDidCloseUndoGroupNotification")
    public static native NSString DidCloseUndoGroupNotification();
    
    @Mapping("beginUndoGrouping")
    public native void beginUndoGrouping();
    @Mapping("endUndoGrouping")
    public native void endUndoGrouping();
    @Mapping("disableUndoRegistration")
    public native void disableUndoRegistration();
    @Mapping("enableUndoRegistration")
    public native void enableUndoRegistration();
    @Mapping("undo")
    public native void undo();
    @Mapping("redo")
    public native void redo();
    @Mapping("undoNestedGroup")
    public native void undoNestedGroup();
    @Mapping("removeAllActions")
    public native void removeAllActions();
    @Mapping("removeAllActionsWithTarget:")
    public native void removeAllActions(Object target);
    @Mapping("registerUndoWithTarget:selector:object:")
    public native void registerUndo(Object target, Selector selector, Object anObject);
    @Mapping("prepareWithInvocationTarget:")
    public native Object prepareWithInvocation(Object target);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setActionIsDiscardable:")
    public native void setActionIsDiscardable(boolean discardable);
    @Mapping("setActionName:")
    public native void setActionName(String actionName);
    @Mapping("undoMenuTitleForUndoActionName:")
    public native String getUndoMenuTitle(String actionName);
    @Mapping("redoMenuTitleForUndoActionName:")
    public native String getRedoMenuTitle(String actionName);
    
}
