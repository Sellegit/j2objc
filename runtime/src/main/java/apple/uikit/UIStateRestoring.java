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


@Library("UIKit/UIKit.h") @Mapping("UIStateRestoring")
public interface UIStateRestoring 
    extends NSObjectProtocol {

    
    
    @Mapping("restorationParent")
    UIStateRestoring getRestorationParent();

    
    @Mapping("encodeRestorableStateWithCoder:")
    void encodeRestorableState(NSCoder coder);
    @Mapping("decodeRestorableStateWithCoder:")
    void decodeRestorableState(NSCoder coder);
    @Mapping("applicationFinishedRestoringState")
    void applicationFinishedRestoringState();

    /*<adapter>*/
    /*</adapter>*/
}
