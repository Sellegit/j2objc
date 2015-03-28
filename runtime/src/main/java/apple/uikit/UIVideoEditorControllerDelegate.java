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


@Library("UIKit/UIKit.h") @Mapping("UIVideoEditorControllerDelegate")
public interface UIVideoEditorControllerDelegate 
    extends UINavigationControllerDelegate {

    
    


    
    @Mapping("videoEditorController:didSaveEditedVideoToPath:")
    void didSave(UIVideoEditorController editor, String editedVideoPath);
    @Mapping("videoEditorController:didFailWithError:")
    void didFail(UIVideoEditorController editor, NSError error);
    @Mapping("videoEditorControllerDidCancel:")
    void didCancel(UIVideoEditorController editor);

    /*<adapter>*/
    /*</adapter>*/
}
