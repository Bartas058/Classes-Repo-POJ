import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

class XMLWriter {
    public static void main(String[] args) {
        String[][] students = {
            { "Jan", "Kowalski", "123456" },
            { "Anna", "Nowak", "789012" },
            { "Adam", "Kwiatkowski", "345678" }
        };

        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter("students.xml"));

            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("students");

            for (String[] student : students) {
                xmlStreamWriter.writeStartElement("student");

                xmlStreamWriter.writeStartElement("firstname");
                xmlStreamWriter.writeCharacters(student[0]);
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("secondname");
                xmlStreamWriter.writeCharacters(student[1]);
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("index");
                xmlStreamWriter.writeCharacters(student[2]);
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeEndElement();
            }

            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            xmlStreamWriter.flush();
            xmlStreamWriter.close();

            System.out.println("Student data successfully written to XML file.");
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}