package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook")
public class ABRecord 
    extends CFType 
     {

    
    public static final int InvalidID = -1;
    
    
    
    
    
    @GlobalFunction("ABRecordGetRecordID")
    public native int getRecordID();
    @GlobalFunction("ABRecordGetRecordType")
    public native ABRecordType getRecordType();
    @GlobalFunction("ABRecordCopyValue")
    protected native CFType getValue(int property);
    @GlobalFunction("ABRecordSetValue")
    protected native boolean setValue(int property, CFType value, Todo error);
    @GlobalFunction("ABRecordRemoveValue")
    protected native boolean removeValue(int property, Todo error);
    @GlobalFunction("ABRecordCopyCompositeName")
    public native String getCompositeName();
    
}
