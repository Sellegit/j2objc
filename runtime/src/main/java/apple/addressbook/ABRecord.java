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
@Library("AddressBook/AddressBook.h")
public class ABRecord 
    extends CFType 
     {

    
    public static final int InvalidID = -1;
    
    
    
    
    
    @GlobalFunction("ABRecordGetRecordID")
    public static native int getRecordID(ABRecord record);
    @GlobalFunction("ABRecordGetRecordType")
    public static native ABRecordType getRecordType(ABRecord record);
    @GlobalFunction("ABRecordCopyValue")
    public static native CFType getValue(ABRecord record, int property);
    @GlobalFunction("ABRecordSetValue")
    public static native boolean setValue(ABRecord record, int property, CFType value, Todo error);
    @GlobalFunction("ABRecordRemoveValue")
    public static native boolean removeValue(ABRecord record, int property, Todo error);
    @GlobalFunction("ABRecordCopyCompositeName")
    public static native String getCompositeName(ABRecord record);
    
}
