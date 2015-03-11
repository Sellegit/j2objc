package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;





@Library("UIKit")
@Mapping("UIDocumentChangeKind")
public final class UIDocumentChangeKind extends ObjCEnum {
    
    @GlobalConstant("UIDocumentChangeDone")
    public static final long Done = 0L;
    @GlobalConstant("UIDocumentChangeUndone")
    public static final long Undone = 1L;
    @GlobalConstant("UIDocumentChangeRedone")
    public static final long Redone = 2L;
    @GlobalConstant("UIDocumentChangeCleared")
    public static final long Cleared = 3L;
    

}
