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





@Library("CoreData/CoreData.h")
@Mapping("NSSnapshotEventType")
public final class NSSnapshotEventType extends ObjCEnum {
    
    @GlobalConstant("NSSnapshotEventUndoInsertion")
    public static final long UndoInsertion = 2L;
    @GlobalConstant("NSSnapshotEventUndoDeletion")
    public static final long UndoDeletion = 4L;
    @GlobalConstant("NSSnapshotEventUndoUpdate")
    public static final long UndoUpdate = 8L;
    @GlobalConstant("NSSnapshotEventRollback")
    public static final long Rollback = 16L;
    @GlobalConstant("NSSnapshotEventRefresh")
    public static final long Refresh = 32L;
    @GlobalConstant("NSSnapshotEventMergePolicy")
    public static final long MergePolicy = 64L;
    

}
