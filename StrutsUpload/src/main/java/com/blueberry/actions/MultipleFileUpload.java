package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/27.
 */
public class MultipleFileUpload extends ActionSupport{
    private List<File> uploads = new ArrayList<File>();
    private List<String>uploadFileNames = new ArrayList<String>();
    private List<String> uploadContentTypes = new ArrayList<String>();

    public List<File> getUploads() {
        return uploads;
    }

    public void setUploads(List<File> uploads) {
        this.uploads = uploads;
    }

    public List<String> getUploadFileNames() {
        return uploadFileNames;
    }

    public void setUploadFileNames(List<String> uploadFileNames) {
        this.uploadFileNames = uploadFileNames;
    }

    public List<String> getUploadContentTypes() {
        return uploadContentTypes;
    }

    public void setUploadContentTypes(List<String> uploadContentTypes) {
        this.uploadContentTypes = uploadContentTypes;
    }

    public String upload(){
        System.out.println("\n\n upload1");
        System.out.println("files:");
        for (File u : uploads) {
            System.out.println("*** " + u + "\t" + u.length());
        }
        System.out.println("filenames:");
        for (String n : uploadFileNames) {
            System.out.println("*** " + n);
        }
        System.out.println("content types:");
        for (String c : uploadContentTypes) {
            System.out.println("*** " + c);
        }
        System.out.println("\n\n");
        return SUCCESS;
    }

}
