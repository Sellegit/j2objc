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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIPickerViewDataSourceAdapter 
    extends Object 
    implements UIPickerViewDataSource {

    
    
    
    
    
    
    
    @NotImplemented("numberOfComponentsInPickerView:")
    public @MachineSizedSInt long getNumberOfComponents(UIPickerView pickerView) { throw new UnsupportedOperationException(); }
    @NotImplemented("pickerView:numberOfRowsInComponent:")
    public @MachineSizedSInt long getNumberOfRows(UIPickerView pickerView, @MachineSizedSInt long component) { throw new UnsupportedOperationException(); }
    
}
