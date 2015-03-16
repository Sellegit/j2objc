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





@Library("UIKit/UIKit.h") @Mapping("UITextInputDelegate")
public interface UITextInputDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("selectionWillChange:")
    void selectionWillChange(UITextInput textInput);
    @Mapping("selectionDidChange:")
    void selectionDidChange(UITextInput textInput);
    @Mapping("textWillChange:")
    void textWillChange(UITextInput textInput);
    @Mapping("textDidChange:")
    void textDidChange(UITextInput textInput);
    
    /*<adapter>*/
    /*</adapter>*/
}
