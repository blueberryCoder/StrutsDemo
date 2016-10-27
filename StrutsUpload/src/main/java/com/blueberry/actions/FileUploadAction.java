package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * Created by Administrator on 2016/10/26.
 */
public class FileUploadAction extends ActionSupport {
    private Logger LOG = LogManager.getLogger(FileUploadAction.class);

    private File fileUpload;
    private String fileUploadContentType;
    private String fileUploadFileName;

    public File getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getFileUploadContentType() {
        return fileUploadContentType;
    }

    public void setFileUploadContentType(String fileUploadContentType) {
        this.fileUploadContentType = fileUploadContentType;
    }

    public String getFileUploadFileName() {
        return fileUploadFileName;
    }

    public void setFileUploadFileName(String fileUploadFileName) {
        this.fileUploadFileName = fileUploadFileName;
    }

    @Override
    public String execute() throws Exception {

//        LOG.printf(Level.DEBUG,"file:"+fileUpload);


        if(fileUpload==null)return NONE;
//
        File destFile = new File("E:\\test\\" + fileUpload.getName());
        FileUtils.copyFile(fileUpload, destFile);
        fileUploadFileName = destFile.getName();
        fileUpload = destFile;
        return SUCCESS;
    }

    public String display() {
        return NONE;
    }
}
