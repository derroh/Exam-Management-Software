package smsfinal;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class mergePdf 
{
    public  void merge(String adm, String form,  String year, String counter) 
    {
        JFileChooser f_r = new JFileChooser();
        FileSystemView f_w = f_r.getFileSystemView();
        String pat_h = f_w.getDefaultDirectory()+"/Unyolo/Student Report Cards";
        File file = new File(pat_h);
        if (!file.exists()) 
        {
            if (file.mkdir()) 
            {
               // System.out.println("Directory is created!");
            } else {
               // System.out.println("Failed to create directory!");
            }
        }
        
        List<InputStream> list = new ArrayList<InputStream>();
        
        JFileChooser fr = new JFileChooser();
        FileSystemView fw = fr.getFileSystemView();
        //String path = fw.getDefaultDirectory()+"";
       
        try {
            
            for(int i=Integer.parseInt(counter); i >= 1; i--)
            { 
           
                list.add(new FileInputStream(new File(fw.getDefaultDirectory()+"/Unyolo/Student Report Cards/"+i+".pdf")));
                
            }
            
            OutputStream out = new FileOutputStream(new File(pat_h+"/Form "+form+" "+year+" reportcards.pdf"));

            doMerge(list, out);
            
            for(int i=Integer.parseInt(counter); i >= 1; i--)
            { 
                boolean success = (new File(pat_h+"/"+i+".pdf")).delete();
               
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Merge multiple pdf into one pdf
     * 
     * @param list
     *            of pdf input stream
     * @param outputStream
     *            output file output stream
     * @throws DocumentException
     * @throws IOException
     */
    public static void doMerge(List<InputStream> list, OutputStream outputStream)
            throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        
        for (InputStream in : list) 
        {
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) 
            {
                document.newPage();
                //import the page from source pdf
                PdfImportedPage page = writer.getImportedPage(reader, i);
                //add the page to the destination pdf
                cb.addTemplate(page, 0, 0);
            }
        }
        
        outputStream.flush();
        document.close();
        outputStream.close();
    }
}
/*********************************************/