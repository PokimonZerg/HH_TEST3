// 3. ����������, ��� � ������ ����������� ��������� ���������� ��������� ������������ ������� SmartPhone. �������� �� �����  SmartPhone ����� ���� ������?

/*
    1. hashCode ������ ������ ���������� ���� � ��-�� �������� ��� ������ � ����-�� �������.
    2. equals ����� �������� NullPointerException ���� ���� �� ������� ������ ����� ����� null.
    3. �� � �� ������. ����� �������� @Override � hashCode(), ������� ���� private � �������� ���������� Date
*/

class SmartPhone {
    String model;
    Date date;
    String revision;

    public SmartPhone(String model, Date date, String revision) {
      model = model;
      date = date;
      revision = revision;
    }

    public int hashCode() {
      return new Random().nextInt();
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      SmartPhone that = (SmartPhone) o;

      if (!date.equals(that.date)) return false;
      if (!model.equals(that.model)) return false;
      if (!revision.equals(that.revision)) return false;

      return true;
    }
    /**
     * setters, getters and
     * some important methods
     *
     *
     */
  }